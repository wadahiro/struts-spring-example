package com.mkyong.customer.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.mkyong.customer.dao.CustomerDao;
import com.mkyong.customer.model.Customer;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class CustomerDaoImpl extends JdbcDaoSupport implements CustomerDao {

	public void addCustomer(Customer customer) {

		customer.setCreatedDate(new Date());
		getJdbcTemplate()
				.update("insert into customer (name, address, created_date) values (?, ?, ?)",
						new Object[] { customer.getName(),
								customer.getAddress(),
								customer.getCreatedDate() });

	}

	public List<Customer> findAllCustomer() {

		return getJdbcTemplate().query("select * from customer",
				new RowMapper() {

					@Override
					public Object mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Customer c = new Customer(rs.getLong("customer_id"), rs
								.getString("name"), rs.getString("address"), rs
								.getDate("created_date"));
						return c;
					}

				});

	}
}