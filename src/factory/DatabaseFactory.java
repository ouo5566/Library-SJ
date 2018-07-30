package factory;

import enums.DBMS;

public class DatabaseFactory {
	public static Database createDatabase(DBMS db) {
		Database data = null;
		switch (db) {
		case ORACLE:
			data = new Oracle();
			break;
		}
		return data;
	}
}
