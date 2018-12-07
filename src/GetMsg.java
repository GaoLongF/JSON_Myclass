import java.io.*;
import java.net.URL;

public class GetMsg
{
    public static String getURLContent(String requsturl) throws IOException {
        //将网页信息加到字符串容器中
        StringBuilder sb=new StringBuilder();
        //创建URL对象
        URL url=new URL(requsturl);
        //建立网上的输入流，得到网页信息
        BufferedReader br=new BufferedReader(
                new InputStreamReader(url.openStream(),"utf-8"));
        //创建输出流将网页信息输出到本地保存
        BufferedWriter bw=new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("Myclass.txt"),"utf-8"));
        String msg=null;
        while((msg=br.readLine())!=null)
        {
            sb.append(msg+"\n");
            bw.append(msg);
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
        return  sb.toString();
    }

}
