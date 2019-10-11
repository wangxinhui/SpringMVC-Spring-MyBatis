package rml.dao;


import org.springframework.stereotype.Repository;
import rml.model.Mmenu;

@Repository
public interface MmenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mmenu record);

    int insertSelective(Mmenu record);

    Mmenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mmenu record);

    int updateByPrimaryKey(Mmenu record);
}