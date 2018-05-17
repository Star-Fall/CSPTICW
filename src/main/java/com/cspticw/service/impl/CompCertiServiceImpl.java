package com.cspticw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cspticw.dao.CompInfoCertiMapper;
import com.cspticw.entity.CompInfoCerti;
import com.cspticw.entity.CompInfoCertiExample;
import com.cspticw.entity.CompInfoCertiExample.Criteria;
import com.cspticw.service.CompCertiService;

@Service
public class CompCertiServiceImpl implements CompCertiService {

	@Autowired
	private CompInfoCertiMapper compInfoCertiMapper;

	@Override
	public CompInfoCerti findCertiInfobyCompId(Long compId) {
		CompInfoCertiExample example = new CompInfoCertiExample();
		Criteria criteria = example.createCriteria();
		criteria.andCompIdEqualTo(compId);
		List<CompInfoCerti> list = compInfoCertiMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@Override
	public boolean addCompCertiInfo(CompInfoCerti record) {
		record.preInsert();
		record.setIsCertified(2);
		compInfoCertiMapper.insert(record);
		return true;
	}

}
