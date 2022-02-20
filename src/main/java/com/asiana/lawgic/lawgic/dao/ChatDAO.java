package com.asiana.lawgic.lawgic.dao;

import com.asiana.lawgic.lawgic.entity.Consult;
import com.asiana.lawgic.lawgic.entity.Message;


import java.sql.SQLException;
import java.util.Collection;

public interface ChatDAO {
    //양식 제출후 고객과 변호사의 채팅방 생성
    public void createChat(Consult consult) throws SQLException;

    //고객과 변호사가 나누는 대화를 데이터베이스에 저장
    public void saveMessages(String chatId, Message message) throws SQLException;

    //과거 채팅 기록을 가져오기(채팅 아이디 반환)
    public Collection<String> getChatIdsByClientId(String clientId) throws SQLException;

    //채팅 아이디를 반환 받으면 해당 채팅 아이디에 해당하는 메시지 내역 다 가져오기
    public Collection<Message> getMessagesByChatId(String chatId) throws SQLException;
}
