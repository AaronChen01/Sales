package com.sales.repository;

import com.sales.dao.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {

    /**
     * 根据那么进行查询
     * @param name
     * @return
     */
    public UserInfo findByAccount(String name);
}
