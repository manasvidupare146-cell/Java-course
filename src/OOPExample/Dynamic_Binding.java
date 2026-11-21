package OOPExample;

class Database1{
     void dbtype()
     {
         System.out.println("RDBMS(Relational Database Management)");
         System.out.println("Mysql,:PostgreSQL,MariaDB->Table");
     }
}
class Database2 extends  Database1{
    void dbtype()
    {
        System.out.println("NRDBMS(Non-Relational Database Management)");
        System.out.println("MongoDB, Reddis(In-memory Database)->JSON");
    }
}

class Database3 extends  Database2{
    void dbtype()
    {
        System.out.println("Cloud-Realtime");
        System.out.println("Supabase,Firebase,Websocket");
    }
}

public class Dynamic_Binding {
    public static void main(String[] args) {
        Database1 obj=new Database1();
        obj.dbtype();

        Database3 obj2=new Database3();
        obj2.dbtype();

    }
}
