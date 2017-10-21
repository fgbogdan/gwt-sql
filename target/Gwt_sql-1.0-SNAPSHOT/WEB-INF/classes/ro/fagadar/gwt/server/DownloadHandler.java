package ro.fagadar.gwt.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadHandler extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String fileRealName = req.getParameter("FILE");
		Path p = Paths.get(fileRealName);
		String fileName = p.getFileName().toString();

		int BUFFER = 1024 * 100;
		// resp.setContentType("application/octet-stream");
		resp.setContentType("application/force-download");
		resp.setHeader("Content-Transfer-Encoding", "binary");
		resp.setHeader("Content-Disposition", "attachment;filename=" + "\"" + fileName + "\"");
		ServletOutputStream outputStream = resp.getOutputStream();
		File f = new File(fileRealName);
		resp.setContentLength(Long.valueOf(f.length()).intValue());
		resp.setBufferSize(BUFFER);

		// push
		FileInputStream fIn = new FileInputStream(fileRealName);
		try {
			byte[] buffer = new byte[4096];
			int length;
			while ((length = fIn.read(buffer)) > 0) {
				outputStream.write(buffer, 0, length);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		fIn.close();
		outputStream.flush();

		// delete the file
		f.delete();

	}

}
