package dao;

import com.quick.Application;
import com.quick.entity.Actor;
import com.quick.entity.Address;
import com.quick.mapper.ActorMapper;
import com.quick.mapper.AddressMapper;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by wangxc on 2017/3/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional
public class AddressTest {

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private ActorMapper actorMapper;

    @Test
    public void testFindList(){
        List<Address> list = addressMapper.findList();
        System.out.println(list.size());
        System.out.println(JSONObject.fromObject(list.get(0)));
    }

    @Test
    public void testSelectByPrimaryKey(){
        Actor actor = actorMapper.selectByPrimaryKey((short) 172);
        System.out.println(actor);


    }

}
