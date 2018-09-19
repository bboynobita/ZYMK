package top.wzmyyj.zymk.view.iv;

import java.util.List;

import top.wzmyyj.zymk.app.bean.BoBean;
import top.wzmyyj.zymk.app.bean.FavorBean;
import top.wzmyyj.zymk.app.bean.ItemBean;
import top.wzmyyj.zymk.view.iv.base.IBaseView;

/**
 * Created by yyj on 2018/06/29. email: 2209011667@qq.com
 */

public interface IHomeView extends IBaseView{
    void loadFavor(List<FavorBean> list);
    void update(List<BoBean> boBeans, List<ItemBean> itemBeans);
}