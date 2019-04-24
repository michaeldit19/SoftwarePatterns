package com.project.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.project.model.Review;
import com.project.repository.ReviewRepository;

@Service("reviewService")
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	ReviewRepository reviewRepository;
	
	
	public void createReview(Review review) {
		review = reviewRepository.save(review);
	}
	
	class UserMapper implements RowMapper<Review> {
		public Review mapRow(ResultSet rs, int arg1) throws SQLException {
			Review review = new Review();

			review.setId(rs.getInt("id"));
			review.setComments(rs.getString("comments"));
			review.setRating(rs.getInt("rating"));
		    

			return review;
		}


}
}
