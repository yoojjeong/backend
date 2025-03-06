package com.exam.statistics;

import java.util.List;

public interface SalesMonthlyService {
    SalesMonthlyDTO findBySalesMonth(String salesMonth);
    List<SalesMonthlyDTO> findBySalesYear(String year);
}
