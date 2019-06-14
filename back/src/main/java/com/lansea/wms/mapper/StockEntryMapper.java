package com.lansea.wms.mapper;

import com.lansea.wms.entity.Sort;
import com.lansea.wms.model.StockEntry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StockEntryMapper {

    Integer insert(@Param("form") StockEntry form);

    Integer update(@Param("form") StockEntry form);

    @Update("update stock_entry set is_del = now() where id in (${ids}) ")
    Integer delete(String ids);

    List<StockEntry> selectWhere(@Param("form") StockEntry form, @Param("sort") Sort sort);

    StockEntry findById(@Param("id") Integer id);

}
