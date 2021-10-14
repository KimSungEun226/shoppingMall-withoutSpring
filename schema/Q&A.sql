--���� ���̺� ����
CREATE TABLE QUESTION(
    QUESTION_NO NUMBER(10) PRIMARY KEY,
    CUSTOMER_NO NUMBER(6) REFERENCES CUSTOMER(CUSTOMER_NO),
    ITEM_NO NUMBER(8) REFERENCES ITEM(ITEM_NO),
    QUESTION_NAME VARCHAR2(60),
    QUESTION_CONTENT VARCHAR2(400) NOT NULL,
    QUESTION_DATE DATE DEFAULT SYSDATE,
    ANSWER_FINISHED NUMBER(1) DEFAULT 0
);

CREATE SEQUENCE QUESTION_NO;

INSERT INTO QUESTION VALUES(QUESTION_NO.NEXTVAL, 1, 1, '�����Դϴ�.', '�̰� ��������� ��� �ǳ���?', DEFAULT, DEFAULT);


--�亯 ���̺� ���� 
CREATE TABLE ANSWER(
    ANSWER_NO NUMBER(10),
    QUESTION_NO NUMBER(10) REFERENCES QUESTION(QUESTION_NO),
    SELLER_NO NUMBER(6) REFERENCES SELLER(SELLER_NO),
    ANSWER_NAME VARCHAR2(60),
    ANSWER_CONTENT VARCHAR2(600) NOT NULL,
    ANSWER_DATE DATE DEFAULT SYSDATE
);

CREATE SEQUENCE ANSWER_NO;