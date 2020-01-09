package id.ac.poliban.mi.sultan.mycrud;

public class Configuration {
    public static final String URL_ADD = "http://172.20.10.3/employee/InsertPegawai.php";
    public static final String URL_GET_ALL = "http://172.20.10.3/employee/GetAllPegawai.php";
    public static final String URL_GET_EMP = "http://172.20.10.3/employee/GetAPegawai.php";
    public static final String URL_UPDATE_EMP = "http://172.20.10.3/employee/UpdatePegawai.php";
    public static final String URL_DELETE_EMP = "http://172.20.10.3/employee/DeletePegawai.php";

    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "nama";
    public static final String KEY_EMP_POSISI = "posisi"; // variabel untuk posisi
    public static final String KEY_EMP_GAJI = "gaji"; // variabel untuk gaji
    //JSON Tags
    public static final String TAG_JSON_ARRAY = "data";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_POSISI = "posisi";
    public static final String TAG_GAJI = "gaji";
    //ID karyawan
//emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
