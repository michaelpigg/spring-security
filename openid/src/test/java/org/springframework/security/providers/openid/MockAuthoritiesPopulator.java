/* Copyright 2004, 2005, 2006 Acegi Technology Pty Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.security.providers.openid;

import org.springframework.security.AuthenticationException;
import org.springframework.security.GrantedAuthority;
import org.springframework.security.GrantedAuthorityImpl;
import org.springframework.security.providers.AuthoritiesPopulator;
import org.springframework.security.userdetails.User;
import org.springframework.security.userdetails.UserDetails;


/**
 * DOCUMENT ME!
 *
 * @author Robin Bramley, Opsera Ltd
 */
public class MockAuthoritiesPopulator implements AuthoritiesPopulator {
    //~ Methods ========================================================================================================

    public UserDetails getUserDetails(String ssoUserId)
        throws AuthenticationException {
        return new User(ssoUserId, "password", true, true, true, true,
            new GrantedAuthority[] {new GrantedAuthorityImpl("ROLE_A"), new GrantedAuthorityImpl("ROLE_B")});
    }
}