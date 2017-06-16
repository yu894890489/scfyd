package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.InternalAnnouncement;
import com.ut.scf.pojo.auto.InternalAnnouncementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InternalAnnouncementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_announcement
     *
     * @mbggenerated Wed May 17 14:24:27 CST 2017
     */
    int countByExample(InternalAnnouncementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_announcement
     *
     * @mbggenerated Wed May 17 14:24:27 CST 2017
     */
    int deleteByExample(InternalAnnouncementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_announcement
     *
     * @mbggenerated Wed May 17 14:24:27 CST 2017
     */
    int deleteByPrimaryKey(String recUid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_announcement
     *
     * @mbggenerated Wed May 17 14:24:27 CST 2017
     */
    int insert(InternalAnnouncement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_announcement
     *
     * @mbggenerated Wed May 17 14:24:27 CST 2017
     */
    int insertSelective(InternalAnnouncement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_announcement
     *
     * @mbggenerated Wed May 17 14:24:27 CST 2017
     */
    List<InternalAnnouncement> selectByExample(InternalAnnouncementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_announcement
     *
     * @mbggenerated Wed May 17 14:24:27 CST 2017
     */
    InternalAnnouncement selectByPrimaryKey(String recUid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_announcement
     *
     * @mbggenerated Wed May 17 14:24:27 CST 2017
     */
    int updateByExampleSelective(@Param("record") InternalAnnouncement record, @Param("example") InternalAnnouncementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_announcement
     *
     * @mbggenerated Wed May 17 14:24:27 CST 2017
     */
    int updateByExample(@Param("record") InternalAnnouncement record, @Param("example") InternalAnnouncementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_announcement
     *
     * @mbggenerated Wed May 17 14:24:27 CST 2017
     */
    int updateByPrimaryKeySelective(InternalAnnouncement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table internal_announcement
     *
     * @mbggenerated Wed May 17 14:24:27 CST 2017
     */
    int updateByPrimaryKey(InternalAnnouncement record);
}