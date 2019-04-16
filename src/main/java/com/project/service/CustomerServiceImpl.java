package com.project.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.project.model.Customers;
import com.project.model.Login;
import com.project.repository.CustomerRepository;




@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	DataSource datasource;
	
	public void register(Customers customers) {
		customers = customerRepository.save(customers);
	}
	
	public Customers validateCustomer(Login login) {
		String sql = "select * from customers where username='" + login.getUsername() + "' and password='"
				+ login.getPassword() + "'";
		List<Customers> customers = jdbcTemplate.query(sql, new UserMapper());
		return customers.size() > 0 ? customers.get(0) : null;
	}
	
	class UserMapper implements RowMapper<Customers> {
		public Customers mapRow(ResultSet rs, int arg1) throws SQLException {
			Customers customers = new Customers();

			customers.setId(rs.getInt("id"));
			customers.setUsername(rs.getString("username"));
			customers.setPassword(rs.getString("password"));
		    customers.setEmail(rs.getString("email"));
		    customers.setFirstname(rs.getString("firstname"));
		    customers.setLastname(rs.getString("lastname"));
		    customers.setBillAddress(rs.getString("bill_address"));

			return customers;
		}

	}

}
