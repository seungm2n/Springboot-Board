package com.board.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.back.model.Board;
import com.board.back.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepo;
	
	public List<Board> getAllBoards() {
		return boardRepo.findAll();
	}

	public Board createBoard(Board board) {
		// TODO Auto-generated method stub
		return boardRepo.save(board);
	}
	
}
