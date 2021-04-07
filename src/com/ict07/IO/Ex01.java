package com.ict07.IO;

public class Ex01 
{
	// File 클래스 : 특정 위치에 존재하는 파일이나 디렉터리(폴더)를 처리하는 클래스
	// 생서자 : File(File parent, String child), File(String pathname), 
	//		  File(String parent, String child), File(URI uri)
	//  	** parent => 상위경로  , child => 하위경로
	// parent + child => 전체경로
	// pathname => 전체경로
	// uri = 나중에 네트워크 할때 필요
	
	// 주요 메소드 
	// - creatNewFile() : boolean => 파일을 생성하면 true, 생성하지 못하면 false(같은 이름이 있으면 생성못함)
	// - mkdir(), mkdirs() : boolean => 디렉터리를 생성하면 true, 못하면 false(같은 이름이 있으면 생성못함)
	// - mkdir(), mkdirs() 차이점
	// 만들고자 하는 디렉터리의 상위디렉터리가 존재하지 않는 경우 생성 불가 => mkdir()
	// ex) c:\base\want => want디렉터리를 만들때 base디렉터리가 없는 경우 생성 불가
	// 상위 디렉터리인 base와 want디렉터리 까지 만들어준다. => mkdirs()
	// - delete() : 파일 디렉터리 삭제
	// - isDirectory() : boolean => 디렉터리이면 true, 아니면 false
	// - isFile() : boolean => 파일이면 true, 아니면 flase
	// **저장측면에서 computer에는 file과 directory만 존재한다.
	//	즉, file이 아니면 directory이다.
	// - ** list() : 지정한 위치의 파일 및 디렉터리를 String[]에 담는다.(웹 디스크 만들때 사용)
	// - length() : 배열이나 String에서는 길이를 뜻하지만,
	//				File 클래스에서는 길이가 아니라 파일의 크기를 byte로 표현한 것
	//				(용량 : byte => KB => MB => GB => TB(한 단계 올라갈때마다 1024(2의 10승)))
	//					1KB = 1024byte
	// - getAbsolutePath() : 절대 경로 표시
	//						경로의 풀네임(시작부터 끝까지) => 여기서 시작은 root를 말함
	// ex) C:\study\javastudy\MyProject\src\com\ict07\IO
	// - getPath() : 상대 결로 표시
	// 				현재 내위치를 기준으로 해당 파일까지 접근하기 위해 거쳐야 하는 경로
	// - getCanonicalPath() : 정규화 경로
	// - lastModified() : 마지막 수정 날짜
	
	

	
	
}
