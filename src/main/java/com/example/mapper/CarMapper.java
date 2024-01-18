package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.entity.Car;

@Mapper
public interface CarMapper {
	public List<Car> findAll(@Param("carId") Integer id, @Param("carName") String name, @Param("carPassengers") Integer passengers);
	
	public void insert(Car car);
	
	public void update(Car car);
	
	public Car findById(Integer id);
	
	public void deleteById(Integer id);
}
