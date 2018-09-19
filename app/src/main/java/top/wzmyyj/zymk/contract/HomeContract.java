package top.wzmyyj.zymk.contract;

import java.util.List;

import top.wzmyyj.zymk.app.bean.FavorBean;
import top.wzmyyj.zymk.view.iv.base.IBaseView;

/**
 * Created by yyj on 2018/09/10. email: 2209011667@qq.com
 */

public interface HomeContract {

    interface View extends IBaseView {
        void loadFavor(List<FavorBean> list);

        void update(int w, Object... objs);
    }


}
