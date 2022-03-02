package com.zensar.training.ui;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Student;

public class Main1 {
	public static void main(String[] args) {

		List<Student> stuList = CollectionFactory.getStudentList();
		System.out.println(stuList);
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------");
		Map<String, List<Student>> studepMap;
		Map<Gender, List<Student>> stugenMap;
		studepMap = stuList.stream().collect(Collectors.groupingBy(Student::getDepartment));
		System.out.println(studepMap);
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------- ");
		stugenMap = stuList.stream().collect(Collectors.groupingBy(Student::getGender));
		System.out.println(stugenMap);

		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------- ");
		Map<Boolean, List<Student>> partition;
		partition = stuList.stream().collect(Collectors.partitioningBy((s) -> s.getAverageMark() > 80));
		System.out.println(partition);
		/*
		 * boolean is used to check weather the condition in the predicate matches, if
		 * it match it will be in true group else in false group
		 * 
		 */
	}
}
