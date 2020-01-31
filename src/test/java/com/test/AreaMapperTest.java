package com.test;

import com.test.entity.Area;
import com.test.mapper.AreaMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaMapperTest {
    @Resource
    private AreaMapper areaMapper;

    @Test
    public void selectAll(){
        Area area = new Area();
        area.setAreaName("荆门");
        areaMapper.insert(area);
    }

    @Test
    public void test(){
        System.out.print("111\n22");
    }

}