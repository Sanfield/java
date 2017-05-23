package com.xatu.file.servlet;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListFileServlet
 */
@WebServlet("/ListFileServlet")
public class ListFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListFileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ�ļ��ϴ�Ŀ¼
		String uploadFilePath =this.getServletContext().getRealPath("/WEB-INF/upload");
		//�洢Ҫ���ص��ļ���
		Map<String,String> fileNameMap = new HashMap<String,String>();
		//�ݹ����filepathĿ¼�µ������ļ���Ŀ¼�����ļ����ļ����洢��map������
		listfile(new File(uploadFilePath),fileNameMap);
		//��Map���Ϸ��͵�listfile.jspҳ�����չʾ
		request.setAttribute("fileNameMap", fileNameMap);
		request.getRequestDispatcher("/ListFile.jsp").forward(request, response);
		
	}
	public void listfile(File file,Map<String,String> map){
		//���file����Ĳ���һ���ļ�������һ��Ŀ¼
		if(!file.isFile()){
			//�г���Ŀ¼�µ������ļ���Ŀ¼
			File files[]=file.listFiles();
			//����files[]
			for(File f:files){
				//�ݹ�
				listfile(f, map);
			}
		}else{
			String realName=file.getName().substring(file.getName().indexOf("__")+1);
			//file.getName()�õ����ļ���ԭʼ���ƣ�����ļ�����Ψһ�Ŀ�����Ϊkey��realName�Ǵ�����ģ������ظ�
			map.put(file.getName(), realName);
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
