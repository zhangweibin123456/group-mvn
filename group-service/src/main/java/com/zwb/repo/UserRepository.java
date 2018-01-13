package com.zwb.repo;

import com.zwb.bean.UserPO;
import com.zwb.commons.BaseRepository;

public interface UserRepository extends BaseRepository<UserPO, Long> {

	public UserPO findByUserNameAndPassWord(String userName, String passWord);

}
