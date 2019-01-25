package top.wzmyyj.zymk.app.application;

import top.wzmyyj.wzm_sdk.tools.L;
import top.wzmyyj.zymk.base.application.BaseApplication;
import top.wzmyyj.wzm_sdk.utils.StatusBarUtil;
import top.wzmyyj.zymk.model.db.utils.DaoManager;

/**
 * @author: ${bruce}
 * @project: smartlock
 * @package: com.boray.smartlock.frags.main.model
 * @description: 添加注释
 * @date: 2019/1/25
 * @time: 10:29
 */
public class App extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        //获取状态栏高度
        StatusBarUtil.initStatusBarHeight(this);
        //gradedao初始化
        DaoManager.getInstance(this.getApplicationContext());
        L.setTAG("ZZZZZZZ");
        L.setDebug(false);
    }
}
