/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-26 17:40:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.back;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("   \r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html class=\"no-js\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<title>后台管理中心</title>\r\n");
      out.write("<meta name=\"description\" content=\"这是一个 index 页面\">\r\n");
      out.write("<meta name=\"keywords\" content=\"index\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\r\n");
      out.write("<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/i/favicon.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/i/app-icon72x72@2x.png\">\r\n");
      out.write("<meta name=\"apple-mobile-web-app-title\" content=\"Amaze UI\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/css/amazeui.min.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/css/admin.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/js/app.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--[if lte IE 9]><p class=\"browsehappy\">升级你的浏览器吧！ <a href=\"http://se.360.cn/\" target=\"_blank\">升级浏览器</a>以获得更好的体验！</p><![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<header class=\"am-topbar admin-header\">\r\n");
      out.write("  <div class=\"am-topbar-brand\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/i/logo.png\"></div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"am-collapse am-topbar-collapse\" id=\"topbar-collapse\">\r\n");
      out.write("    <ul class=\"am-nav am-nav-pills am-topbar-nav admin-header-list\">\r\n");
      out.write("\r\n");
      out.write("   <li class=\"am-dropdown tognzhi\" data-am-dropdown>\r\n");
      out.write("  <button class=\"am-btn am-btn-primary am-dropdown-toggle am-btn-xs am-radius am-icon-bell-o\" data-am-dropdown-toggle> 消息管理<span class=\"am-badge am-badge-danger am-round\">6</span></button>\r\n");
      out.write("  <ul class=\"am-dropdown-content\">\r\n");
      out.write("  \t\r\n");
      out.write("  \t\r\n");
      out.write("  \t\r\n");
      out.write("    <li class=\"am-dropdown-header\">所有消息都在这里</li>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <li><a href=\"#\">未激活会员 <span class=\"am-badge am-badge-danger am-round\">556</span></a></li>\r\n");
      out.write("    <li><a href=\"#\">未激活代理 <span class=\"am-badge am-badge-danger am-round\">69</span></a></a></li>\r\n");
      out.write("    <li><a href=\"#\">未处理汇款</a></li>\r\n");
      out.write("    <li><a href=\"#\">未发放提现</a></li>\r\n");
      out.write("    <li><a href=\"#\">未发货订单</a></li>\r\n");
      out.write("    <li><a href=\"#\">低库存产品</a></li>\r\n");
      out.write("    <li><a href=\"#\">信息反馈</a></li>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </ul>\r\n");
      out.write("</li>\r\n");
      out.write("\r\n");
      out.write(" <li class=\"kuanjie\">\r\n");
      out.write(" \t\r\n");
      out.write(" \t<a href=\"#\">会员管理</a>          \r\n");
      out.write(" \t<a href=\"#\">奖金管理</a> \r\n");
      out.write(" \t<a href=\"#\">订单管理</a>   \r\n");
      out.write(" \t<a href=\"#\">产品管理</a> \r\n");
      out.write(" \t<a href=\"#\">个人中心</a> \r\n");
      out.write(" \t <a href=\"#\">系统设置</a>\r\n");
      out.write(" </li>\r\n");
      out.write("\r\n");
      out.write(" <li class=\"soso\">\r\n");
      out.write(" \t\r\n");
      out.write("<p>   \r\n");
      out.write("\t\r\n");
      out.write("\t<select data-am-selected=\"{btnWidth: 70, btnSize: 'sm', btnStyle: 'default'}\">\r\n");
      out.write("          <option value=\"b\">全部</option>\r\n");
      out.write("          <option value=\"o\">产品</option>\r\n");
      out.write("          <option value=\"o\">会员</option>\r\n");
      out.write("          \r\n");
      out.write("        </select>\r\n");
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<p class=\"ycfg\"><input type=\"text\" class=\"am-form-field am-input-sm\" placeholder=\"圆角表单域\" /></p>\r\n");
      out.write("<p><button class=\"am-btn am-btn-xs am-btn-default am-xiao\"><i class=\"am-icon-search\"></i></button></p>\r\n");
      out.write(" </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <li class=\"am-hide-sm-only\" style=\"float: right;\"><a href=\"javascript:;\" id=\"admin-fullscreen\"><span class=\"am-icon-arrows-alt\"></span> <span class=\"admin-fullText\">开启全屏</span></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<div class=\"am-cf admin-main\"> \r\n");
      out.write("\r\n");
      out.write("<div class=\"nav-navicon admin-main admin-sidebar\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"sideMenu am-icon-dashboard\" style=\"color:#aeb2b7; margin: 10px 0 0 0;\"> 欢迎系统管理员：清风抚雪</div>\r\n");
      out.write("    <div class=\"sideMenu\">\r\n");
      out.write("      <h3 class=\"am-icon-flag\"><em></em>商品管理</h3>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"\">商品列表</a></li>\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"itemManage\">添加新商品</a></li>\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"itemKind\">商品分类</a></li>\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"itemPerson\">用户评论</a></li>\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"itemState\">商品回收站</a></li>\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"itemNumber\">库存管理</a> </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <h3 class=\"am-icon-cart-plus\"><em></em>  订单管理</h3>\r\n");
      out.write("      <ul>\r\n");
      out.write("      \t<!-- 所有用户的订单列表 -->\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"orderList\">订单列表</a></li>\r\n");
      out.write("        <!-- 指定用户的订单 -->\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"orderUser\">用户订单</a></li>\r\n");
      out.write("        <!-- 已完成支付的用户订单列表 -->\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"orderComplete\">发货单列表</a></li>\r\n");
      out.write("        <!-- 类似easymall表单下载 -->\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"orderDownload\">订单打印</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <h3 class=\"am-icon-users\"><em></em>会员界面</h3>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"user\">会员列表</a> </li>\r\n");
      out.write("        <!-- 会员是否启用和一般信息修改 -->\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"userInfo\">会员信息</a></li>\r\n");
      out.write("        <!-- 角色模块 -->\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"userLevel\">会员等级</a></li>\r\n");
      out.write("        <!-- 权限模块 -->\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"levelInfo\">等级权限</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <h3 class=\"am-icon-users\"><em></em>员工界面</h3>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"staff\">员工列表</a> </li>\r\n");
      out.write("        <!-- 员工的一般信息修改 -->\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"staffInfo\">员工信息</a></li>\r\n");
      out.write("        <!-- 添加新员工 -->\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"staffAdd\">添加新员工信息</a></li>\r\n");
      out.write("        <!-- 角色模块 -->\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"staffJob\">员工职位</a></li>\r\n");
      out.write("        <!-- 权限模块 -->\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'><a href=\"jobInfo\">角色权限</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- sideMenu End --> \r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\t\t\tjQuery(\".sideMenu\").slide({\r\n");
      out.write("\t\t\t\ttitCell:\"h3\", //鼠标触发对象\r\n");
      out.write("\t\t\t\ttargetCell:\"ul\", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏\r\n");
      out.write("\t\t\t\teffect:\"slideDown\", //targetCell下拉效果\r\n");
      out.write("\t\t\t\tdelayTime:300 , //效果时间\r\n");
      out.write("\t\t\t\ttriggerTime:150, //鼠标延迟触发时间（默认150）\r\n");
      out.write("\t\t\t\tdefaultPlay:true,//默认是否执行效果（默认true）\r\n");
      out.write("\t\t\t\treturnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t</script> \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\" admin-content\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"daohang\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><button type=\"button\" class=\"am-btn am-btn-default am-radius am-btn-xs\"> 首页 </li>\r\n");
      out.write("\t\t\t\t<li><button type=\"button\" class=\"am-btn am-btn-default am-radius am-btn-xs\">帮助中心<a href=\"javascript: void(0)\" class=\"am-close am-close-spin\" data-am-modal-close=\"\">×</a></button></li>\r\n");
      out.write("\t\t\t\t<li><button type=\"button\" class=\"am-btn am-btn-default am-radius am-btn-xs\">奖金管理<a href=\"javascript: void(0)\" class=\"am-close am-close-spin\" data-am-modal-close=\"\">×</a></button></li>\r\n");
      out.write("\t\t\t\t<li><button type=\"button\" class=\"am-btn am-btn-default am-radius am-btn-xs\">产品管理<a href=\"javascript: void(0)\" class=\"am-close am-close-spin\" data-am-modal-close=\"\">×</a></button></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"admin\">\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"admin-index\">\r\n");
      out.write("      <dl data-am-scrollspy=\"{animation: 'slide-right', delay: 100}\">\r\n");
      out.write("        <dt class=\"qs\"><i class=\"am-icon-users\"></i></dt>\r\n");
      out.write("        <dd>455</dd>\r\n");
      out.write("        <dd class=\"f12\">团队数量</dd>\r\n");
      out.write("      </dl>\r\n");
      out.write("      <dl data-am-scrollspy=\"{animation: 'slide-right', delay: 300}\">\r\n");
      out.write("        <dt class=\"cs\"><i class=\"am-icon-area-chart\"></i></dt>\r\n");
      out.write("        <dd>455</dd>\r\n");
      out.write("        <dd class=\"f12\">今日收入</dd>\r\n");
      out.write("      </dl>\r\n");
      out.write("      <dl data-am-scrollspy=\"{animation: 'slide-right', delay: 600}\">\r\n");
      out.write("        <dt class=\"hs\"><i class=\"am-icon-shopping-cart\"></i></dt>\r\n");
      out.write("        <dd>455</dd>\r\n");
      out.write("        <dd class=\"f12\">商品数量</dd>\r\n");
      out.write("      </dl>\r\n");
      out.write("      <dl data-am-scrollspy=\"{animation: 'slide-right', delay: 900}\">\r\n");
      out.write("        <dt class=\"ls\"><i class=\"am-icon-cny\"></i></dt>\r\n");
      out.write("        <dd>455</dd>\r\n");
      out.write("        <dd class=\"f12\">全部收入</dd>\r\n");
      out.write("      </dl>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"admin-biaoge\">\r\n");
      out.write("      <div class=\"xinxitj\">信息概况</div>\r\n");
      out.write("      <table class=\"am-table\">\r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th>团队统计</th>\r\n");
      out.write("            <th>全部会员</th>\r\n");
      out.write("            <th>全部未激活</th>\r\n");
      out.write("            <th>今日新增</th>\r\n");
      out.write("            <th>今日未激活</th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>普卡</td>\r\n");
      out.write("            <td>普卡</td>\r\n");
      out.write("            <td><a href=\"#\">4534</a></td>\r\n");
      out.write("            <td>+20</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>银卡</td>\r\n");
      out.write("            <td>银卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+2</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>金卡</td>\r\n");
      out.write("            <td>金卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+10</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>钻卡</td>\r\n");
      out.write("            <td>钻卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+50</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>合计</td>\r\n");
      out.write("            <td>合计</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+50</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("      <table class=\"am-table\">\r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th>团队统计</th>\r\n");
      out.write("            <th>全部会员</th>\r\n");
      out.write("            <th>全部未激活</th>\r\n");
      out.write("            <th>今日新增</th>\r\n");
      out.write("            <th>今日未激活</th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>普卡</td>\r\n");
      out.write("            <td>普卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+50</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>银卡</td>\r\n");
      out.write("            <td>银卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+2</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>金卡</td>\r\n");
      out.write("            <td>金卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+10</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>钻卡</td>\r\n");
      out.write("            <td>钻卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+50</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>合计</td>\r\n");
      out.write("            <td>合计</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+50</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("      <table class=\"am-table\">\r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th>资金统计</th>\r\n");
      out.write("            <th>账户总收入</th>\r\n");
      out.write("            <th>账户总支出</th>\r\n");
      out.write("            <th>账户余额</th>\r\n");
      out.write("            <th>今日收入</th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>普卡</td>\r\n");
      out.write("            <td>普卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+20</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>银卡</td>\r\n");
      out.write("            <td>银卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+2</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>金卡</td>\r\n");
      out.write("            <td>金卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+10</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>钻卡</td>\r\n");
      out.write("            <td>钻卡</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+50</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>合计</td>\r\n");
      out.write("            <td>合计</td>\r\n");
      out.write("            <td>4534</td>\r\n");
      out.write("            <td>+50</td>\r\n");
      out.write("            <td> 4534 </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"shuju\">\r\n");
      out.write("      <div class=\"shujuone\">\r\n");
      out.write("        <dl>\r\n");
      out.write("          <dt>全盘收入：  1356666</dt>\r\n");
      out.write("          <dt>全盘支出：   5646465.98</dt>\r\n");
      out.write("          <dt>全盘利润：  546464</dt>\r\n");
      out.write("        </dl>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <h2>26.83%</h2>\r\n");
      out.write("          <li>全盘拨出</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"shujutow\">\r\n");
      out.write("        <dl>\r\n");
      out.write("          <dt>全盘收入：  1356666</dt>\r\n");
      out.write("          <dt>全盘支出：   5646465.98</dt>\r\n");
      out.write("          <dt>全盘利润：  546464</dt>\r\n");
      out.write("        </dl>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <h2>26.83%</h2>\r\n");
      out.write("          <li>全盘拨出</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"slideTxtBox\">\r\n");
      out.write("        <div class=\"hd\">\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li>其他信息</li>\r\n");
      out.write("            <li>工作进度表</li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"bd\">\r\n");
      out.write("          <ul>\r\n");
      out.write("            <table width=\"100%\" class=\"am-table\">\r\n");
      out.write("              <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"7%\"  align=\"center\">1 </td>\r\n");
      out.write("                  <td width=\"83%\" >工作进度名称</td>\r\n");
      out.write("                  <td width=\"10%\"  align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td align=\"center\">1 </td>\r\n");
      out.write("                  <td>工作进度名称</td>\r\n");
      out.write("                  <td  align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td  align=\"center\">1 </td>\r\n");
      out.write("                  <td>工作进度名称</td>\r\n");
      out.write("                  <td  align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td  align=\"center\">1 </td>\r\n");
      out.write("                  <td>工作进度名称</td>\r\n");
      out.write("                  <td  align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td  align=\"center\">1 </td>\r\n");
      out.write("                  <td>工作进度名称</td>\r\n");
      out.write("                  <td  align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td  align=\"center\">1 </td>\r\n");
      out.write("                  <td>工作进度名称</td>\r\n");
      out.write("                  <td  align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td  align=\"center\">1 </td>\r\n");
      out.write("                  <td>工作进度名称</td>\r\n");
      out.write("                  <td  align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("              </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <table class=\"am-table\">\r\n");
      out.write("              <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>普卡</td>\r\n");
      out.write("                  <td>普卡</td>\r\n");
      out.write("                  <td><a href=\"#\">4534</a></td>\r\n");
      out.write("                  <td>+20</td>\r\n");
      out.write("                  <td> 4534 </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>银卡</td>\r\n");
      out.write("                  <td>银卡</td>\r\n");
      out.write("                  <td>4534</td>\r\n");
      out.write("                  <td>+2</td>\r\n");
      out.write("                  <td> 4534 </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>金卡</td>\r\n");
      out.write("                  <td>金卡</td>\r\n");
      out.write("                  <td>4534</td>\r\n");
      out.write("                  <td>+10</td>\r\n");
      out.write("                  <td> 4534 </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>钻卡</td>\r\n");
      out.write("                  <td>钻卡</td>\r\n");
      out.write("                  <td>4534</td>\r\n");
      out.write("                  <td>+50</td>\r\n");
      out.write("                  <td> 4534 </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>合计</td>\r\n");
      out.write("                  <td>合计</td>\r\n");
      out.write("                  <td>4534</td>\r\n");
      out.write("                  <td>+50</td>\r\n");
      out.write("                  <td> 4534 </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <script type=\"text/javascript\">jQuery(\".slideTxtBox\").slide();</script> \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"foods\">\r\n");
      out.write("    \t<ul>零食铺子后台管理系统</ul>\r\n");
      out.write("    \t<dl><a href=\"\" title=\"返回头部\" class=\"am-icon-btn am-icon-arrow-up\"></a></dl>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \t\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script src=\"http://libs.baidu.com/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/js/polyfill/rem.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/js/polyfill/respond.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/js/amazeui.legacy.js\"></script>\r\n");
      out.write("<![endif]--> \r\n");
      out.write("\r\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!--> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staticsource/js/amazeui.min.js\"></script>\r\n");
      out.write("<!--<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/pages/back/index.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("sc");
    // /WEB-INF/pages/back/index.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/back/index.jsp(4,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
