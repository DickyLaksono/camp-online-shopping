using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SQLite;

namespace 課題18
{
    public class DB
    {
        private static string dbPath = Path.Combine(Application.StartupPath, "employees.db");

        private static string ConnectionString = $"Data Source={dbPath};Version=3;";

        public static void ExecuteSQL(string sql, SQLiteParameter[] parameters)
        {
            SQLiteConnection conn = null;
            SQLiteCommand cmd = null;
            //string connectionString = $"Data Source={dbPath};Version=3";

            try
            {
                conn = new SQLiteConnection(ConnectionString);
                conn.Open();
                cmd = conn.CreateCommand();
                cmd.CommandText = sql;
                cmd.Parameters.AddRange(parameters);
                cmd.ExecuteNonQuery();
            }
            finally
            {
                if (cmd != null)
                {
                    cmd.Dispose();
                }
                if (conn != null)
                {
                    conn.Close();
                }
            }
        }

    }
}
