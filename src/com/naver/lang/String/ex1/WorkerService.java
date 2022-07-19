package com.naver.lang.String.ex1;

public class WorkerService
{
	// private String info;
	private StringBuffer sb;

	public WorkerService() // 기본 지정자
	{
		// info = "iu-인사과-과장-0101111";
		// info = info + ", suji-IT부서-대리-0102222";
		// info = info + ", choa-영업부-사원-0103333";
		// info = info + ", hini-마케팅-사원-0104444";

		String a = "iu-인사과-과장-0101111";
		String b = ", suji-IT부서-대리-0102222";
		String c = ", choa-영업부-사원-0103333";
		String d = ", hini-마케팅-사원-0104444";

		sb = new StringBuffer();
		sb.append(a);
		sb.append(b);
		sb.append(c);
		sb.append(d);
	}

	public WorkerDTO[] init()
	{
		// info를 파싱해서 WorkerDTO에 대입하고, WorkerDTO를 모은 배열을 리턴
		// System.out.println(this.info);

		String info = sb.toString();
		// String newInfo = this.info.replace(",", "-");
		String newInfo = info.replace(",", "-");
		String[] infos = newInfo.split("-");

		WorkerDTO[] workerDTOs = new WorkerDTO[(infos.length) / 4];

		System.out.println(infos.length);

		for (int i = 0; i < infos.length; i++)
		{
			WorkerDTO workerDTO = new WorkerDTO();

			workerDTOs[i / 4] = workerDTO;
			workerDTO.setName(infos[i].trim());
			workerDTO.setDepartment(infos[++i].trim());
			workerDTO.setJob(infos[++i].trim());
			workerDTO.setPhone(infos[++i].trim());
		}
		return workerDTOs;
	}
}
