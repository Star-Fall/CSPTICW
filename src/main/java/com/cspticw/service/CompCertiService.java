package com.cspticw.service;

import com.cspticw.entity.CompInfoCerti;

public interface CompCertiService {

	CompInfoCerti findCertiInfobyCompId(Long compId);

	boolean addCompCertiInfo(CompInfoCerti record);
}
