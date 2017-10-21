package ro.fagadar.gwt.client;

import java.io.Serializable;

import ro.fagadar.daylight.*;

public class FirmInfo implements Serializable {

	private static final long serialVersionUID = 381753217377423853L;

	private DBRecord firmInfo = new DBRecord();

	public FirmInfo() {
	}

	public void setFirmInfo(DBRecord rec) {
		firmInfo = rec;
	}

	public DBRecord getFirmInfo() {
		return firmInfo;
	}
}