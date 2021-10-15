package dto;

public class BoardDTO {
    private int boardNo;          //�۹�ȣ
    private String boardName;     //�������� �� ����
    private String boardContents; //�������� �ۼ� ����
    private String boardDate;     //�������� �ۼ� ����
    private int boardViews;		  //�������� ��ȸ��
    
    //������ó��
    private int pageCnt;
    
    public BoardDTO() {}

	public BoardDTO(int boardNo, String boardName, String boardContents, String boardDate, int boardViews) {
		super();
		this.boardNo = boardNo;
		this.boardName = boardName;
		this.boardContents = boardContents;
		this.boardDate = boardDate;
		this.boardViews = boardViews;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public String getBoardContents() {
		return boardContents;
	}

	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
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

	public int getPageCnt() {
		return pageCnt;
	}

	public void setPageCnt(int pageCnt) {
		this.pageCnt = pageCnt;
	}
	
    
}
