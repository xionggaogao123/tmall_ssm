package com.how2java.tmall.mapper;

import com.how2java.tmall.pojo.Order;
import com.how2java.tmall.pojo.OrderExample;
import java.util.List;
import java.util.Map;

public interface OrderMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    List<Order> listOrderExcludedStatus(Map map);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}