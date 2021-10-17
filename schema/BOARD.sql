CREATE TABLE BOARD(
    BOARD_NO NUMBER(10) PRIMARY KEY,
    BOARD_NAME VARCHAR2(60) NOT NULL,
    BOARD_CONTENT VARCHAR2(1000),
    BOARD_DATE DATE DEFAULT SYSDATE,
    BOARD_VIEWS NUMBER
);

CREATE SEQUENCE BOARD_NO;

INSERT INTO BOARD VALUES(BOARD_NO.NEXTVAL, '�������� �Դϴ�.', '<��� ����ô°�> �� ���Ű� ȯ���մϴ�', DEFAULT, 0);
INSERT INTO BOARD VALUES(BOARD_NO.NEXTVAL, '�� <��� �Ծ�ô°�?> ��ȯ/��ǰ �ȳ� ��', '�������ǰ ��ȯ/��ǰ �ȳ��n�ؿ�� ����ô°�?�� ����Ǹ��߰����̸�, ����Ǹ��� ����ڰ� �ƴմϴ�. 
�n��ǰ, ��ǰ����, �ŷ��� ���� �ǹ��� å���� �Ǹ��ڿ��� �ֽ��ϴ�.', DEFAULT, 0);

SELECT * FROM BOARD;

COMMIT;

