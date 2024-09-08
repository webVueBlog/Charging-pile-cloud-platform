package org.dromara.demo.service;

import jakarta.servlet.http.HttpServletResponse;

/**
 * 导出下拉框Excel示例
 */
public interface IExportExcelService {

    /**
     * 导出下拉框
     *
     * @param response /
     */
    void exportWithOptions(HttpServletResponse response);
}
