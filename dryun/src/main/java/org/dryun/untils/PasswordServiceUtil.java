package org.dryun.untils;

/**
 * @author
 * @功能 ：验证密码、修改密码工具类
 */
public class PasswordServiceUtil {

    /**
     * 验证密码的正确性
     * @param encPassword 数据库中保存的加密密码
     * @param password 用户输入的密码
     * @param salt 数据库中保存的用户salt值
     * @return 返回验证结果
     */
    public static boolean chenckPassword(String salt,String encPassword,String password){
        PasswordEncoderUtil encoder = new PasswordEncoderUtil(salt);
        boolean passwordValid = encoder.isPasswordValid(encPassword, password);
        return passwordValid;
    }

    /**
     * 根据密码值返回加密后的密码及盐值，修改密码、创建用户时使用，
     * 可以将返回的加密密码及salt存入数据库中
     * @param password 用户输入的密码
     * @return 返回加密后的密码及盐值
     **/
    public static String[] getEncPasswordAndSalt(String password){
        String salt = PasswordEncoderUtil.createSalt(6);//获取6位盐值
        PasswordEncoderUtil encoder = new PasswordEncoderUtil(salt);
        String encPassword = encoder.encode(password);//加密后的密码

        String [] args = new String[2];
        args[0] = encPassword;
        args[1] = salt;
        return args;
    }
}
