/*
 * @Author      : daguan814
 * @date        : 2023/1/1 22:33
 * @Description :
 */


package org.shuijing.gushe_app.common;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;


import java.util.Date;
import java.util.UUID;

/**
 * token验证
 */
public class JwtUtils {

    //token有效期 7days
    private static long timeRole = 1000 * 60 * 60 * 7 * 24;

    //钥匙
    private static String SECRET = "tangshuijing";


    public static String createToken(String username, String role) {


        Date expireDate = new Date(System.currentTimeMillis() + timeRole);
        return JWT.create()
//                .withClaim("account", user.getAccount())
//                .withClaim("userName", user.getUserName())
//                .withClaim("empCode", user.getEmpCode())
                .withExpiresAt(expireDate)
                .sign(Algorithm.HMAC256(SECRET));

    }

    public static boolean checkToken(String token) {
//          System.out.println(token);
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
            DecodedJWT decodedJWT  = verifier.verify(token);
            return true;
        }catch (Exception e){
            return false;
        }

    }


}