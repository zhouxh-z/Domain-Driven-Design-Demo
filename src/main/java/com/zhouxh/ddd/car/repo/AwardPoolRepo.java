package com.zhouxh.ddd.car.repo;

import com.zhouxh.ddd.car.domain.aggregate.AggregateDemo;
import org.springframework.stereotype.Repository;

/**
 * 资源库
 * 作用：和各类数据库打交道
 * @author zhouxh
 */
@Repository
public class AwardPoolRepo {
    /**
     * 根据id获取 抽奖聚合根
     * @param id
     * @return
     */
    public AggregateDemo getAggregate(Integer id){
        // 伪代码，实际上应该时从数据库获取的
        AggregateDemo aggregateDemo = new AggregateDemo();
        return aggregateDemo;
    }
}
