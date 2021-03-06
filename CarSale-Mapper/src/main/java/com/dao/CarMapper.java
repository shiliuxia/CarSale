package com.dao;

import com.pojo.Car;
import common.Assist;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarMapper{
	/**
	 * 获得Car数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getCarRowCount(Assist assist);
	/**
	 * 获得Car数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Car> selectCar(Assist assist);
	/**
	 * 获得Car数据集合,该方法为多表关联时保证分页的数据不缺失不重复,可以正常得到所有数据,如果非多表分页的情况建议使用不带ofPaging的方法,可以通过辅助工具Assist进行查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Car> selectCarOfPaging(Assist assist);
	/**
	 * 获得一个Car对象,以参数Car对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Car selectCarByObj(Car obj);
	/**
	 * 通过Car的id获得Car对象
	 * @param id
	 * @return
	 */
    Car selectCarById(Integer id);
	/**
	 * 插入Car到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCar(Car value);
	/**
	 * 插入Car中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyCar(Car value);
	/**
	 * 批量插入Car到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCarByBatch(List<Car> value);
	/**
	 * 通过Car的id删除Car
	 * @param id
	 * @return
	 */
    int deleteCarById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Car
	 * @param assist
	 * @return
	 */
    int deleteCar(Assist assist);
	/**
	 * 通过Car的id更新Car中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateCarById(Car enti);
 	/**
	 * 通过辅助工具Assist的条件更新Car中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateCar(@Param("enti") Car value, @Param("assist") Assist assist);
	/**
	 * 通过Car的id更新Car中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyCarById(Car enti);
 	/**
	 * 通过辅助工具Assist的条件更新Car中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyCar(@Param("enti") Car value, @Param("assist") Assist assist);
}