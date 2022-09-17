package service.impl;

import org.springframework.stereotype.Service;
import service.TestService;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhilichen
 * @Date: 2022/09/17/17:38
 * @Description:
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        System.out.println("master修改了");
    }
}
