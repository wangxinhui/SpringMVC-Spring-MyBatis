package rml.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rml.dao.MUserMapper;
import rml.model.MUser;

@Service
public class MUserServiceImpl implements MUserServiceI {

    @Autowired
    private MUserMapper muserMapper;

    @Override
    public List<MUser> getAll() {
        MUser m = new MUser();
        String id = UUID.randomUUID().toString();
        m.setId(id);
        m.setName("111");
        m.setAddress("aaaa");
        m.setAge(12);
        insert(m);
        return muserMapper.getAll();
    }

    @Override
    public int insert(MUser muser) {
        int r = muserMapper.insert(muser);
        int a = 1 / 0;
        System.out.println(a);
        return r;
    }

    @Override
    public int update(MUser muser) {

        return muserMapper.updateByPrimaryKey(muser);
    }

    @Override
    public int delete(String id) {

        return muserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public MUser selectByPrimaryKey(String id) {

        return muserMapper.selectByPrimaryKey(id);
    }

}
