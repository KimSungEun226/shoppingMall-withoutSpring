package dto;

public class BoardDTO {
    private String boardNo;          //글번호
    private String boardName;     //공지사항 글 제목
    private String boardContent; //공지사항 작성 내용
    private String boardDate;     //공지사항 작성 일자
    private int boardViews;		  //공지사항 조회수
    private String password;
    private String fname;
    private int fsize;
    
    //페이지처리
    private int pageCnt;
    
    public BoardDTO() {}
    
    public BoardDTO(String boardName, String boardContent, String password) {
		this.boardName = boardName;
		this.boardContent = boardContent;
		this.password = password;
	}
    
    public BoardDTO(String boardNo, String boardName, String boardContent, String password) {
    	this(boardName, boardContent, password);
    	this.boardNo = boardNo;
		
	}
    
	public BoardDTO(String boardNo, String boardName, String boardContent, String boardDate, int boardViews,
			String password, String fname, int fsize) {
		this(boardName, boardContent, password);
		this.boardNo = boardNo;
		this.boardDate = boardDate;
		this.boardViews = boardViews;
		this.fname = fname;
		this.fsize = fsize;
	}

	public String getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(String boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	public int getBoardViews() {
		return boardViews;
	}

	public void setBoardViews(int boardViews) {
		this.boardViews = boardViews;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getFsize() {
		return fsize;
	}

	public void setFsize(int fsize) {
		this.fsize = fsize;
	}

	public int getPageCnt() {
		return pageCnt;
	}

	public void setPageCnt(int pageCnt) {
		this.pageCnt = pageCnt;
	}
    
	
    
}
