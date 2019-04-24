package com.project.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.project.model.Card;
import com.project.repository.CardRepository;


@Service("cardService")
public class CardServiceImpl implements CardService {
	
	@Autowired
	private CardRepository cardRepository;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	DataSource datasource;
	
	public void createCard(Card card) {
		card = cardRepository.save(card);
	}
	
	class UserMapper implements RowMapper<Card> {
		public Card mapRow(ResultSet rs, int arg1) throws SQLException {
			Card card = new Card();

			card.setId(rs.getInt("id"));
			card.setCardType(rs.getString("cardType"));
			card.setCardNumber(rs.getString("cardNumber"));
			card.setExpiryDate(rs.getInt("expiryDate"));
		    

			return card;
		}

}
}
