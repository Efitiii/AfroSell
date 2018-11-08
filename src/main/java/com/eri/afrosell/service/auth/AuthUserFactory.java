/*
 * Copyright (c) NIT-Software. All Rights Reserved.
 * This software is the confidential and proprietary information of NIT-Software,
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with NIT-Software.
 */
package com.eri.afrosell.service.auth;

import com.eri.afrosell.model.AuthUser;
import com.eri.afrosell.model.User;

/**
 *
 * @author Quy Duong
 */
public interface AuthUserFactory {
    
    AuthUser createAuthUser(User user);
}
