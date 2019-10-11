package rml.service;

import rml.model.Mmenu;

public interface MmenuService {
    int deleteByPrimaryKey(Integer id);

    int insert(Mmenu record);

    int insertSelective(Mmenu record);

    Mmenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mmenu record);

    int updateByPrimaryKey(Mmenu record);
}
