package edu.java.contact05;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.*;

public class ContactDAOImple implements ContactDAO {

	private static ContactDAOImple instance = null;
	private ArrayList<ContactVO> list = new ArrayList<>();
	
	// 데이터를 저장할 폴더, 파일명 정의
	private static final String DATA_DIR = "data";
	private static final String DATA_FILE = "contact.data";
	
	// data 폴더의 contact.data 파일을 관리할 File 객체 선언
	private File dataDir;
	private File dataFile;
	
	// 입출력 스트림 선언
	private InputStream in = null;
	private BufferedInputStream bin = null;
	private ObjectInputStream oin = null;
	private OutputStream out = null;
	private BufferedOutputStream bout = null;
	private ObjectOutputStream oout = null;
	
	public ContactDAOImple() {
		initDataDir();
		initDataFile();
	} // end constructor
	
	// TODO : data 폴더가 있는지 검사하고, 없으면 생성하는 함수
	private void initDataDir() {
		dataDir = new File(DATA_DIR);
		System.out.println("폴더 경로 : " + dataDir.getPath());
		if(!dataDir.exists()) {
			try {
				if(dataDir.mkdir())
					System.out.println("폴더 생성 성공");
				else System.err.println("폴더 생성 실패");
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}else {
			System.out.println("폴더가 이미 존재합니다. ");
		}
		
	} // end initDataDir()
	
	// TODO : 데이터 파일이 존재하는지 검사하고, 
	// 없는 경우 새로운 데이터 파일 생성
	// 있는 경우 기존 파일에서 데이터 읽어서 ArrayList에 추가
	private void initDataFile() {
		String filePath = DATA_DIR + File.separator + DATA_FILE;
		dataFile = new File(filePath);
		if(dataFile.exists()) { // 있는 경우
			//if(dataFile.length() != 0)
			readDataFromFile();
		}else { // 없는 경우
			try {
				if(dataFile.createNewFile()) {
					System.out.println("파일 생성 성공");					
				}else {
					System.err.println("파일 생성 실패");					
				}
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
	} // end initDataFile()
	
	// TODO : 멤버 변수 list 객체를 data\contact.data 파일에 저장(쓰기)
	private void writeDataToFile() {
		try {
			out = new FileOutputStream(dataFile);
			bout = new BufferedOutputStream(out);
			oout = new ObjectOutputStream(bout);
			
			oout.writeObject(list);
			System.out.println("파일에 쓰기 성공");
		} catch (Exception e) {
			System.err.println("파일에 쓰기 실패");
		} finally {
			try {
				oout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return;
		
	} // end writeDataToFile()
	
	// TODO : data\contact.data 파일에서 ArrayList 객체를 읽어와서
	// 멤버 변수 list에 저장(읽기)
	private void readDataFromFile() {
		try {
			in = new FileInputStream(dataFile);
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			
			list = (ArrayList<ContactVO>) oin.readObject();
			
			System.out.println("파일에서 읽어오기 성공");
		} catch (EOFException e){
			System.out.println("내용 없는 파일");
		}catch (Exception e) {
			System.err.println("파일에서 읽어오기 실패");
			e.printStackTrace();
		} finally {
			try {
				oin.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return;
	} // end readDataFromFile()
	
	
	public static ContactDAOImple getInstance() {
		if(instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	} // end getInstance

	@Override
	public int insert(ContactVO contact) {
		System.out.println("log : insert()");
		list.add(contact);
		writeDataToFile();
		return 1;
	} // end insert

	@Override
	public ArrayList<ContactVO> selectAll() {
		System.out.println("log : selectAll()");
		return list;
	} // end selectAll

	@Override
	public ContactVO selectByIndex(int index) {
		System.out.println("log : selectByIndex()");
		return list.get(index);
	} // end selectByIndex

	@Override
	public int update(int index, ContactVO contact) {
		System.out.println("log : update()");
		list.set(index, contact);
		writeDataToFile();
		return 1;
	} // end update

	@Override
	public int delete(int index) {
		System.out.println("log : delete()");
		list.remove(index);
		writeDataToFile();
		return 1;
	} // end delete

	@Override
	public int getContactNum() {
		return list.size();
	} // end getContactNum

}
