package com.eric.moonshineonme.cm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eric.moonshineonme.cm.mapper.INoteMapper;
import com.eric.moonshineonme.cm.pojo.entity.Note;
import com.eric.moonshineonme.cm.service.INoteService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Description:
 * </P>
 *
 * @author wangfei
 * @since 2020-07-09
 */
@Service
public class NoteServiceImpl extends ServiceImpl<INoteMapper, Note> implements INoteService {
}
