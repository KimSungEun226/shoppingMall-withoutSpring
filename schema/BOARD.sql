CREATE TABLE BOARD(
    BOARD_NO NUMBER(10) PRIMARY KEY,
    BOARD_NAME VARCHAR2(60) NOT NULL,
    BOARD_CONTENT VARCHAR2(1000),
    BOARD_DATE DATE DEFAULT SYSDATE,
    BOARD_VIEWS NUMBER
);

CREATE SEQUENCE BOARD_NO;

INSERT INTO BOARD VALUES(BOARD_NO.NEXTVAL, '공지사항 입니다.', '<요거 묵어봤는감> 에 오신걸 환영합니다', DEFAULT, 0);
INSERT INTO BOARD VALUES(BOARD_NO.NEXTVAL, '※ <요거 먹어봤는감?> 교환/반품 안내 ※', '농수산제품 교환/반품 안내굈※요거 묵어봤는감?은 통신판매중개자이며, 통신판매의 당사자가 아닙니다. 
굈상품, 상품정보, 거래에 관한 의무와 책임은 판매자에게 있습니다.', DEFAULT, 0);

SELECT * FROM BOARD;

COMMIT;

