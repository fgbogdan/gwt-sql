package ro.fagadar.gwt.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ro.fagadar.daylight.*;

@RemoteServiceRelativePath("DBService")
public interface DBService extends RemoteService {

	String deleteDBRecord(String p_TableName, String p_KeyColumnName, String p_KeyColumnValue) throws DBException;

	String deleteDBRecord(String p_SQLCommand) throws DBException;

	DBRecord GetDBRecord(String p_tableName, String p_colName, String p_colValue);

	DBRecord GetDBRecordForConditon(String p_sqlCond);

	DBRecord GetDBRecordForConditon(String p_tableName, String p_sqlCond);

	DBRecord GetBlankDBRecord(String p_tableName, String p_colName, String p_colValue, String p_colKeyName);

	String saveDBRecord(DBRecord R) throws DBException;

	// String ReadWriteConf(String key, String value);

	DBTable getDBTable(String strSQLCommand) throws DBException;

	DBTable getDBTable(String p_strTableName, String p_strKeyName, String p_strFilterCondition) throws DBException;

	DBTable getDBTable(String p_strTableName, String p_strKeyName, String p_strFilterCondition,
			String p_strOrderCondition) throws DBException;

	List<DBTable> getDBXTable(String p_strSQLCommand) throws DBException;

	DBTable saveDBTable(DBTable oTable) throws DBException;

	String executeNoResultSet(String p_sqlCommand) throws DBException;

	String executeResultSetNoOutput(String p_sqlCommand) throws DBException;

	void SetIniFileName(String strIniFileName);

	String GetIniFileName();

	String deleteFile(String fileNamewithPathandExt);

	void D(String strText);

	DBRecord DoLogin(String p_strAlias, String p_strPassword, String p_AliasField, String p_PasswordField);

	DBRecord DoLogin(String p_strAlias, String p_strPassword, String p_AliasField, String p_PasswordField,
			String p_tableName);

	DBRecord doClientLogin(ArrayList<String> fieldsList, ArrayList<String> valuesList);

	String DoLogout();

	List2D LoadListXDFromData(String strSQLCommand, String strFilterCondition);

	List2D LoadListXDFromData(String strTableName, String strShowField, String strKeyField, String strFilterCondition,
			String strOrder);

	String getReport(String fileName, HashMap<String, Object> param, String type) throws DBException;

	String SQLToExcel(String p_strSQL, String p_fileName);

	String DBTableToExcel(DBTable p_T, String p_fileName);

	String PrintFile(String p_cFileNameWithPath);

	String PrintPDFFile(String p_cFileNameWithPath);

	String DBTableToTemplateExcel(DBTable p_T, String p_fileName, String p_templateName, String p_sheetName);

	String DBTableToTemplateExcel(List<DBTable> p_LT, String p_fileName, String p_templateName,
			List<String> p_LsheetName);

	String SQLToTemplateExcel(String p_strSQL, String p_fileName, String p_templateName, String p_sheetName);

	String SQLToTemplateExcel(String p_strSQL, String p_fileName, String p_templateName, List<String> p_LsheetName);

}
