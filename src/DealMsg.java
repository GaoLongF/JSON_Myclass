
import Mysql.JDBCoper;
import Students.Students;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.IOException;
import java.sql.SQLException;


public class DealMsg
{
    public static void main(String[] args)
    {
        String stuMsg=null;
        String name;
        int id;
        int grade;
        int birthday;
        String sex;
        Students stu;
        String url="http://jwzx.cqupt.edu.cn/data/json_StudentSearch.php?searchKey=13001701";
        JDBCoper coper=new JDBCoper();
        try {
            coper.creatTable();     //建立班级表
            stuMsg=GetMsg.getURLContent(url);       //得到班级信息资源
            JSONObject date1=JSONObject.fromObject(stuMsg);     //处理JSON数据
            JSONArray arr=date1.getJSONArray("returnData");
            for(int i=0;i<arr.size();i++)
            {
                String s=arr.getString(i);
                System.out.println(s);
                JSONObject date2=JSONObject.fromObject(s);
                name=date2.getString("xm");
                id=date2.getInt("xh");
                grade=date2.getInt("nj");
                birthday=date2.getInt("csrq");
                sex=date2.getString("xb");
                stu=new Students(name,id,grade,birthday,sex);
                coper.insert(stu);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}