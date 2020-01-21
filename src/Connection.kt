import java.sql.*
import java.util.Properties

public class MySQLDatabaseExampleKotlin {

	internal var conn: Connection? = null
	internal var username = "root"
	internal var password = ""

	fun main(args: Array<String>) {
		getConnection()
		executeMySQLQuery()
	}

	fun executeMySQLQuery() {

		var stmt: Statement? = null
		var resultset: ResultSet? = null

		try {
			stmt = conn!!.createStatement()
			resultset = stmt!!.executeQuery("Select * from people;")

			if (stmt.execute("select * from people;")) {
				resultset = stmt.resultSet
			}

			while (resultset!!.next()) {
				println(resultset.getString("registrationDB"))
			}

		} catch (ex: SQLException) {
			ex.printStackTrace()

		} finally {
			if (resultset != null) {

				try {
					resultset.close()
				} catch (sqlEx: SQLException) {
					sqlEx.printStackTrace()
				}

				resultset = null
			}

			if (stmt != null) {

				try {
					stmt.close()
				} catch (sqlEx: SQLException) {
					sqlEx.printStackTrace()
				}

				stmt = null
			}

			if (conn != null) {

				try {
					conn!!.close()
				} catch (sqlEx: SQLException) {
					sqlEx.printStackTrace()
				}

				conn = null

			}
		}
	}

	fun getConnection() {

		val connectionProps = Properties()
		connectionProps.put("root", username)
		connectionProps.put("", password)

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance()

			conn = DriverManager.getConnection(

				"jdbc:" + "mysql" + "://" +

						"127.0.0.1" +

						":" + "3306" + "/" +

						"",

				connectionProps
			)

		} catch (ex: SQLException) {
			ex.printStackTrace()
		} catch (ex: Exception) {
			ex.printStackTrace()
		}
	}
} 