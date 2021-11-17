package com.pr5.websocket;

import org.springframework.data.jpa.repository.JpaRepository;

public interface dbMessageQuery extends JpaRepository<com.pr5.websocket.dbMessage, Long> {
}