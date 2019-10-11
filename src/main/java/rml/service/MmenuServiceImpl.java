package rml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rml.dao.MmenuMapper;
import rml.model.Mmenu;

@Service
public class MmenuServiceImpl implements MmenuService {

    @Autowired
    private MmenuMapper mmenuMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mmenuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Mmenu record) {
        return mmenuMapper.insert(record);
    }

    @Override
    public int insertSelective(Mmenu record) {
        return mmenuMapper.insertSelective(record);
    }

    @Override
    public Mmenu selectByPrimaryKey(Integer id) {
        return mmenuMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Mmenu record) {
        return mmenuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Mmenu record) {
        return mmenuMapper.updateByPrimaryKey(record);
    }
}
