package ro.fagadar.gwt.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

import ro.fagadar.daylight.*;;

public interface DBServiceAsync {

	void deleteDBRecord(String p_TableName, String p_KeyColumnName, String p_KeyColumnValue, AsyncCallback<String> asyncCallback);

	void deleteDBRecord(String p_SQLCommand, AsyncCallback<String> asyncCallback);

	void GetDBRecord(String p_tableName, String p_colName, String p_colValue, AsyncCallback<DBRecord> asyncCallback);

	void GetDBRecordForConditon(String p_sqlCond, AsyncCallback<DBRecord> asyncCallback);

	void GetDBRecordForConditon(String p_tableName, String p_sqlCond, AsyncCallback<DBRecord> asyncCallback);

	void saveDBRecord(DBRecord R, AsyncCallback<String> callback);

	void GetBlankDBRecord(String p_tableName, String p_colName, String p_colValue, String p_colKeyName, AsyncCallback<DBRecord> callback);

	void getDBTable(String strSQLCommand, AsyncCallback<DBTable> asyncCallback);

	void getDBTable(String p_strTableName, String p_strKeyName, String p_strFilterCondition, AsyncCallback<DBTable> asyncCallback);

	void getDBTable(String p_strTableName, String p_strKeyName, String p_strFilterCondition, String p_strOrderCondition,
			AsyncCallback<DBTable> asyncCallback);

	void getDBXTable(String strSQLCommand, AsyncCallback<List<DBTable>> asyncCallback);

	void saveDBTable(DBTable oTable, AsyncCallback<DBTable> callback);

	void SetIniFileName(String strIniFileName, AsyncCallback<Void> callback);

	void GetIniFileName(AsyncCallback<String> callback);

	void executeNoResultSet(String p_sqlCommand, AsyncCallback<String> asyncCallback);

	void executeResultSetNoOutput(String p_sqlCommand, AsyncCallback<String> callback);

	void D(String strText, AsyncCallback<Void> callback);

	void deleteFile(String fileNamewithPathandExt, AsyncCallback<String> callback);

	void DoLogin(String p_strAlias, String p_strPassword, String p_AliasField, String p_PasswordField, AsyncCallback<DBRecord> callback);

	void DoLogin(String p_strAlias, String p_strPassword, String p_AliasField, String p_PasswordField, String p_tableName,
			AsyncCallback<DBRecord> callback);

	void doClientLogin(ArrayList<String> fieldsList, ArrayList<String> valuesList, AsyncCallback<DBRecord> callback);

	void DoLogout(AsyncCallback<String> callback);

	void LoadListXDFromData(String strSQLCommand, String strFilterCondition, AsyncCallback<List2D> callback);

	void LoadListXDFromData(String strTableName, String strShowField, String strKeyField, String strFilterCondition, String strOrder,
			AsyncCallback<List2D> callback);

	void getReport(String fileName, HashMap<String, Object> param, String type, AsyncCallback<String> callback);

	void SQLToExcel(String p_strSQL, String p_fileName, AsyncCallback<String> asyncCallback);

	void DBTableToExcel(DBTable p_T, String p_fileName, AsyncCallback<String> asyncCallback);

	void PrintFile(String p_cFileNameWithPath, AsyncCallback<String> callback);

	void PrintPDFFile(String p_cFileNameWithPath, AsyncCallback<String> callback);

	void DBTableToTemplateExcel(DBTable p_T, String p_fileName, String p_templateName, String p_sheetName, AsyncCallback<String> asyncCallback);

	void DBTableToTemplateExcel(List<DBTable> p_LT, String p_fileName, String p_templateName, List<String> p_LsheetName,
			AsyncCallback<String> callback);

	void SQLToTemplateExcel(String p_strSQL, String p_fileName, String p_templateName, String p_sheetName, AsyncCallback<String> callback);

	void SQLToTemplateExcel(String p_strSQL, String p_fileName, String p_templateName, List<String> p_LsheetName, AsyncCallback<String> callback);

}
